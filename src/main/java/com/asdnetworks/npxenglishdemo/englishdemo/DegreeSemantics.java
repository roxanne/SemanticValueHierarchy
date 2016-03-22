package com.asdnetworks.npxenglishdemo.englishdemo;

import com.asdnetworks.npxenglishdemo.semanticvalues.ModifiableSemantics;

public class DegreeSemantics extends ModifiableSemantics
{
   public String notApplicableTo = "";
      // can contain combinations of
      // "abs" for "absolute"
      // "comp" for "comparative"
      // "sup" for "superlative"
   public String change = null;  // or "increasing", "decreasing",
      // or "changing"
//   public boolean isGradeable = false; //

}