%% this file contains style files for DLR letters,
%% 2014-01-16 first version by seth_da
% head
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{dlrletter}[2014/01/16 v1.0 DLR letter class wrapper]

\RequirePackage{xkeyval}

% any options are passed to scrreprt
\DeclareOptionX*{%
  \PassOptionsToClass{\CurrentOption}{scrlttr2}%
}
% process and execute options
\ProcessOptionsX\relax

% load scrlttr2 class
\LoadClass[dlr]{scrlttr2}
%\LoadLetterOption{dlr}
