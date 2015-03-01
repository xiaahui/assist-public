assist
======

Architecture Synthesis for Safety-Critical Systems


Ideas for improvements in order of "importance"

- generate constraints only if needed (done?)
- only use core location vars for the solver (done?)
- boolean channeling instad of reification for indicator variables
- store indicator vars in variable storage

Refactoring
- skip uneeded levels (Processor, Core) in input and constraints / variables
 - allow properties for the board as well
- join RAM and ROM constraint classes
- reduce number of exception classes

For the next project
- symmetry breaking
