Coding Challenge
================

Introduction
------------

This was a coding challenge given to a colleague from a potential employer. I thought it would be fun to see
how I'd attack the problem. The challenge was quite fair from my point of view because it put more realistic 
demands on the designer than you'd find in a face-to-face timed interview.

Problem Statement
-----------------

The actual problem statement can be found in the PDF attached to this project. Note that there are 
maximum runtime limits outlined in the problem statement. There are also maximum memory limits, which I have
not validated, but this solution should fall well under that maximum.

The problem descriptin implies that the faster your design is, the better it will be. I don't really agree
with this, in that at some extremes, optimizations can distort a design by making it much more
complex. As designers, our job is to balance the simplicity of the design against the complexity required to meet
the performance constraints. The goodness of this balance really needs to be evaluated in the business context. 

Since my design runs about 20X faster than the maximum allowed time, I did not further try to optimize it. Note 
also that I wanted to solve this problem without brushing up on any combinatorics, so there may be some best
practices that this code does not reflect.

Solving The Problem
-------------------

The problem is a combinatorics kind of problem. The problem statement described the brute force approach
and recommended against it. I did code this case up initially because it provided much-needed, known-good
results for unit testing the optimized solution. For a detailed description of the algorithm used, see the
[Solution](Solution.md). I strongly urge you to read that document before trying to understand the code (not that
the code is that complex).

Notes
-----

Is this code overdone in terms of design, test, etc? Maybe. If it really were a utility for example that is
not shipped, it is overdone. If it is an example of how production code might look and be handled, in my
opinion, it is fine. 

Good developers try to separate concerns and to think at least a little about reuse. This code shows some
of that thinking. The code is separated into different classes to afford better isolation for testing and
for easier understanding.

Note that I pretty much ignored both packaging and the organization of the source code folders in this
project.

Note also that the comments are sparse. This is for a couple of reasons. First, and most controversially is
that I try to follow the SLAP principle. The code should mostly be self-documenting and understandable with
small methods. Comments should be there to point out the "whys" not the "hows." Second, usually you want you
code to fit in with whatever standard the development team sets, so I did not invest in doing javadoc for
all of the classes and methods. See Clean Coders for discussions around the use of comments that I happen to agree
with.

I use a Preconditions class to help support a weak form of Programming by Contract.

Most of the code has unit test coverage. I did not run a coverage tool and I was not pedantic about it. I
am a very strong believer in unit testing and would have preferred using Groovy/Spock to test this code. For
illustrative purposes, I did not want to confuse the issue and include another language and library, so I
did not pursue this.

There are other libraries that might help here instead of rolling my own (Google Guava in particular), but
I wanted this self-contained so I restrained myself.

Author
------

Comments? Feedback? Please feel free to leave them in the Git repository.