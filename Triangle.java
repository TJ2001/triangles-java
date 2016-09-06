class Triangle {
 public int mSide1;
 public int mSide2;
 public int mSide3;

 public Triangle(int side1, int side2, int side3){
   mSide1 = side1;
   mSide2 = side2;
   mSide3 = side3;
 }

 public boolean equilateral(){
   return (mSide1 == mSide2 && mSide2 == mSide3);
 }

 public boolean isosceles(){
   return (mSide1 == mSide2 || mSide2 == mSide3 || mSide3 == mSide1);
 }

 public boolean scalene(){
   return (mSide1 != mSide2 && mSide2 != mSide3 && mSide1 != mSide3);
 }
}
