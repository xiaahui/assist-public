%
% This is file `ifacconf-hacks.cls',
% it fixes bugs in the corresponding publication documentclass
%
%		- Remove default \includegraphics size, because this destroys \psfragfig[width=...]
%		- Use preferred BibTeX style by default
%
% The following files contain the original style definition:
% 	- ifacconf.cls
% 	- ifacconf.bst 
%
% REVISIONS:    2014-08-19 First version
%               
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2014 DLR System Dynamics and Control       __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{ifacconf-hacks}
        [2013/04/21 v0.2 DLR hacks for IFAC conference paper class]

%
% Retrieve original document class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Define command to remove the "-hacks" and set \hacks@currname
\def\hacks@remove#1-hacks{\def\hacks@currname{#1}}

% Define \hacks@currname
\expandafter\hacks@remove\@currname

%
% Make sure, all options are passed to the original class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Use xkeyval for that
\RequirePackage{xkeyval}

% Any undefined options are passed to original class
\DeclareOptionX*{%
	\PassOptionsToClass{\CurrentOption}{\hacks@currname}%
}

% Process options
\ProcessOptionsX\relax

%
% PRE: Do hacks before loading the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%
% Load the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\LoadClass{\hacks@currname}

%
% POST: Do hacks after loading the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Check for recency of package
\@ifclasslater{\hacks@currname}{2008/04/14}{}{%
	\PackageWarning{\hacks@currname-hacks}
	               {You appear not to have loaded the most recent \hacks@currname\space class!}
}

% Make sure, natbib is loaded as required
\RequirePackage{natbib}

% Hyperref is broken with \section*
\RequirePackage{etoolbox}

% Determine, if hyperref is loaded "AtBeginDocument"
\newif\ififacconf@hyper
\ifacconf@hyperfalse
\AtBeginDocument{
  \@ifpackageloaded{hyperref}{
    \ifacconf@hypertrue
  }{
    \ifacconf@hyperfalse
  }
}

% Execute the hack after "AtBeginDocument"
\AfterEndPreamble{
\ififacconf@hyper
  \def\NR@ssect#1#2#3#4#5{
    \Hy@MakeCurrentHrefAuto{section*}
    \setlength{\Hy@SectionHShift}{#1pt} % HERE is added: "pt" :-/
    \begingroup
      \toks@{\H@old@ssect{#1}{#2}{#3}{#4}}\toks
      \tw@\expandafter{\expandafter\Hy@SectionAnchorHref\expandafter{\@currentHref}#5}
      \edef\x{\endgroup\the\toks@{\the\toks\tw@}}
    \x
  }
\fi}

% Redefine parskip, as it has no flexible space
% This destroys \flushbottom, if no headings are given in between...
\parskip6pt plus5pt minus2pt