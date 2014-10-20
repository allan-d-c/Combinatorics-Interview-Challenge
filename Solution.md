Solution
========

The brute force solution of enumerating all of the permutations, sorting them, then 
looking for the target is not performant in either time or space.

Things to notice immediately are: there is a potentially large permutation space, and
by specifying the next character of your target, you are largely eliminating portions
of that space. That is the key to the solution.

In one sentence, use each successive character of the target to winnow down the 
permutation space even further, until you end up at one index.

Algorithm
---------

# Step 1

Recode the original target from characters into numbers (for easier later comparison).
So a target might be BOOKS. The recoded version would be 0-2-2-1-3, where each number
replaces a single letter and the relative relationship between the numbers retains the
sorted relationship between the letters. Another example of this would be QUESTION,
which would be recoded as 4-7-0-5-6-1-3-2.

# Step 2

The goal of the algorithm is to keep track of how many permutations are lost every
time you move to the next character. For example, if you have "abde", the first 
character is "a" so you haven't thrown out any permutations. If the first letter
had been "b", you would have incurred a "debt fraction" of the first 1/4 of the 
permutation space "lost." If it had been "d", it would have been 3/4 debt. 

So the goal of this step is to calculate the debts for the sequence. If the target
was "abcg" or recoded as 0-1-2-3, the debts would be 0-0-0-0 because we each
number was the lowest possible of the remaining ones, moving from left to right.
If the target was "cgba", the debts would be 2/4-2/3-1/2-0.

If we look at "books", the recoded version is 0-2-2-1-3, with debts 0-1/4-1/3-0-0.
Note that the repeated characters have no impact on the debt fractions, but will
in the next step.

# Step 3

In this step, we need to figure out the possible permutations along the sequence
as we process it from left to right. The simplist case is a target that has no
repeated characters, like "abcd". In this case, the number of permutations when
considering 4 characters is 4!. Moving a slot to the right, the possible permutations
is 3!, and so on. So the resulting populations for "abcd" are 4!-3!-2!-1! This
would be true for any 4 character sequence of unique characters.

When dealing with repeated characters, we need to remember our combinatorics. For
five unique characters, there are 5! combinations. If two of them are the same, then
that is 5! / 2!. If there two sets of two repeated characters, then there are
5! / (2! 2!). Note that the parenthesis are just that, they are the N-choose-M notation.

So going back to our 0-2-2-1-3 example, the first popluation is 5!/2!, which accounts
for 5 digits with 2 repeated. Moving one digit to the right, the population is 4!/2!.
Moving to the right, it is 3!, then 2!, then 1!. So the final populations sequence
is 5!/2!-4!/2!-3!-2!-1!. The - sign is NOT MINUS - it is just a separator.

# Step 4

The final step is to combine the debt fractions with the populations in kind of a
"dot product" operation to yield how many permutations have been lost to debt from
the start of the permutation space. In our example this would be shown below (this
time the - does mean minus!):

debt = 0*5!/2! - 1/4*4!/2! - 1/3*3! - 0*2! - 0*1! = 5 lost slots

So our final answer is that the next slot is the one we want, namely 6.