#!/usr/bin/env python
"""
@file    testEvaluate.py
@author  Michael Behrisch
@date    2015-03-24
@version $Id: $
"""
import unittest

import evaluate


class TestEvaluate(unittest.TestCase):
    
    mdslIn = """Global { 
    System name = "Example System";
}

Compartment C1 {
    RDC RDC1 {
        Connector Connector1 {
            "CustomType0" = 2;
            "CustomType13" = 3;
        }

        Connector Connector2 {
            "CustomType0" = 2;
            "CustomType4" = 2;
        }

        Connector Connector3 {
            "CustomType0" = 2;
            "CustomType1" = 1;
        }
    }
}


Interfaces {
    Interface Iface1 {
        Type = "CustomType0";
    }
    
    Interface Iface2 {
        Type = "CustomType0";
    }
    
    Interface Iface3 {
        Type = "CustomType1";
    }
}

InterfaceGroups {
    Group G1 { Iface1,Iface2 };
    Group G2 { Iface3 };
}

Restrictions {
    G1,G2 dislocal up to Connector;
    Iface1,Iface2 on same Connector;
}
"""

    
    def testParse(self):
        mdsl = evaluate.parseMDSL(self.mdslIn.splitlines())
        self.assertEqual(len(mdsl.hardware), 1)

    def testSolutionAssign(self):
        mdsl = evaluate.parseMDSL(self.mdslIn.splitlines())
        sol1 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = {  }
    C1.RDC1.Connector3 = { Iface3, }
    """
        self.assertTrue(evaluate.checkSolution(mdsl, sol1.splitlines()))
        sol2 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = { Iface1, }
    C1.RDC1.Connector3 = { Iface3, }
    """
        self.assertFalse(evaluate.checkSolution(mdsl, sol2.splitlines()))
        sol3 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = { Iface3, }"""
        self.assertFalse(evaluate.checkSolution(mdsl, sol3.splitlines()))
        sol4 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = {  }"""
        self.assertFalse(evaluate.checkSolution(mdsl, sol4.splitlines()))


    def testSolutionColoc(self):
        mdsl = evaluate.parseMDSL(self.mdslIn.splitlines())
        sol1 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = {  }
    C1.RDC1.Connector3 = { Iface3, }
    """
        self.assertTrue(evaluate.checkSolution(mdsl, sol1.splitlines()))
        sol2 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1, }
    C1.RDC1.Connector2 = { Iface2, }
    C1.RDC1.Connector3 = { Iface3, }
    """
        self.assertFalse(evaluate.checkSolution(mdsl, sol2.splitlines()))


    def testSolutionDisloc(self):
        mdsl = evaluate.parseMDSL(self.mdslIn.splitlines())
        sol1 = """1 solutions found
    C1.RDC1.Connector1 = { Iface1,Iface2, }
    C1.RDC1.Connector2 = {  }
    C1.RDC1.Connector3 = { Iface3, }
    """
        self.assertTrue(evaluate.checkSolution(mdsl, sol1.splitlines()))
        sol2 = """1 solutions found
    C1.RDC1.Connector3 = { Iface1,Iface2,Iface3, }
    """
        self.assertFalse(evaluate.checkSolution(mdsl, sol2.splitlines()))

if __name__ == '__main__':
    unittest.main()
