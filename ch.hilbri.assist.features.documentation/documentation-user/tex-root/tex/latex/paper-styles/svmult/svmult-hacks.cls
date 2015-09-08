%
% This is file `svmult-hacks.cls',
% it fixes bugs in the corresponding publication documentclass
%
% REVISIONS:    2014-10-09 First version
%               
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2014 DLR System Dynamics and Control       __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{svmult-hacks}
        [2014/10/09 v0.1 DLR hacks for Springer Verlag Multi-Contributors Books]


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
% Fix bad content level for author etc.
\AtBeginDocument{
  \@ifpackageloaded{hyperref}{
    \providecommand{\toclevel@author}{0}
    \providecommand{\toclevel@title} {0}}{}}

% Use URL as suggested for email addresses
\RequirePackage{url}

% Prevent creating appendices
\def\appendix{
  \section*{Appendix}
  \addcontentsline{toc}{section}{Appendix}
}

%
% SUBMIT: This should go into the preamble, once you submit your .tex
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Font definitions as in template
\RequirePackage{mathptmx}        % selects Times Roman as basic font
\RequirePackage{helvet}          % selects Helvetica as sans-serif font
\RequirePackage{courier}         % selects Courier as typewriter font
\RequirePackage{type1cm}         % activate if the above 3 fonts are
                                 % not available on your system
                                 % NOTE: Typically they are not in size 8.5...

% Some more packages as in template
\RequirePackage{makeidx}         % allows index generation
\RequirePackage{graphicx}        % standard LaTeX graphics tool
                                 % when including figure files
%\usepackage{epstopdf}

% Define some more appearance
\RequirePackage{multicol}        % used for the two-column index
\RequirePackage[bottom]{footmisc}% places footnotes at page bottom

\makeindex                       % used for the subject index
                                 % please use the style svind.ist with
                                 % your makeindex program

% Load correct bib-style
\bibliographystyle{plainurl}

% SWITCH TO BIBTEX HERE
\iftrue
  % Use normal \bibliographystyle and \bibliography
\else
  \def\bibliography#1{\input{\jobname.bbl}}
\fi




