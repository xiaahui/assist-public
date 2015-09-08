(TeX-add-style-hook
 "dlrtext"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-class-options
                     '(("dlrbook" "figures=dlr")))
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("inputenc" "latin1") ("fontenc" "T1") ("babel" "ngerman" "english") ("hyperref" "pdfauthor={Andreas Klöckner}" "pdftitle={The DLR report layout}" "colorlinks=true" "linkcolor=black" "citecolor=black" "urlcolor=blue" "pdfstartview={Fit}")))
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "path")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "url")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "nolinkurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperbaseurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperimage")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperref")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "path")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "url")
   (TeX-run-style-hooks
    "latex2e"
    "dlrbook"
    "dlrbook10"
    "inputenc"
    "fontenc"
    "babel"
    "dlrsecondpage"
    "caption"
    "subcaption"
    "booktabs"
    "array"
    "hyperref")
   (LaTeX-add-labels
    "eq:example"
    "elements:figure:adler1"
    "elements:figure:logo1"
    "elements:figure"
    "elements:table"
    "tab:DLRsecondpage")))

