Coding Challenge
================

Introduction
------------

This was a coding challenge from a potential employer, which I thought was quite fair in that it puts
some demands on the coder that are closer to real-world constraints than you'd find in a face-to-face
interview situation.

Problem Statement
-----------------

This is a solution to the problem statement that can be found in the PDF in this project. There are 
maximum performance time constraints on the solution. There are also memory constraints, which I have
not checked, but this solution should be well below that maximum.

The problem implication is that the faster your design is, the better it will be. I don't really agree
with this, in that at some point, performance constraints can distort a design by making it much more
complex. Our job is to balance the simplicity of the design against the complexity required to meet
the performance constraints. The goodness of this balance really needs to be evaluated by the current
business context. 

Since my design runs about 20X below the maximum allowed time, I did not further try to optimize it,
preferring simplicity over further performance gains.

Solving The Problem
-------------------

The problem is a combinatorics kind of problem. The problem statement described the brute force approach
and recommended against it. I did code this case up initially because it provided much-needed known-good
results for testing the optimized solution. For a detailed description of the algorithm used, see the
Solution.md. I strongly urge you to read that document before trying to understand the code (not that
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
all of the classes and methods. See Clean Coders for discussions about comments that I happen to agree
with.

I use a Preconditions class to help support a weak form of programming by contract.

Most of the code has unit test coverage. I did not run a coverage tool and I was not pedantic about it. I
am a very strong believer in unit testing and would have preferred using Groovy/Spock to test this code. For
illustrative purposes, I did not want to confuse the issue and include another language and library, so I
did not pursue this.

There are other libraries that might help here instead of rolling my own (Google Guava in particular), but
I wanted this self-contained so I restrained myself.

Author
------

Comments? Feedback? Please feel free to leave them in the Git repository or to mail spamster-at-austin.rr.com