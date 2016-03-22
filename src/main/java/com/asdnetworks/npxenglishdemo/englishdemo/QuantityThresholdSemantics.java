package com.asdnetworks.npxenglishdemo.englishdemo;

public class QuantityThresholdSemantics extends QuantitySemantics
{
   public QuantityThresholdSemantics(ThresholdSemantics givenThreshold)
   {  threshold = givenThreshold;
   }

   public ThresholdSemantics threshold;
}