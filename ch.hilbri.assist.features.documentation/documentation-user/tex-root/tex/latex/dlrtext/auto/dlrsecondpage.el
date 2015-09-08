(TeX-add-style-hook
 "dlrsecondpage"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("isodate" "english")))
   (TeX-run-style-hooks
    "getdocinfo"
    "dlrinstitutes"
    "listofversions"
    "isodate"
    "username"
    "tabularx"
    "longtable"
    "tabu")
   (TeX-add-symbols
    '("DocHistory" 3)
    '("DocID" 3)
    "secondpage"
    "xdotfill"
    "subject"
    "keywords"
    "restrictions"
    "author"
    "coauthor"
    "savedby"
    "approvedby"
    "releasedby"
    "contactname"
    "telnumber"
    "faxnumber"
    "email")))

