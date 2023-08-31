This project is used to work with polynomial equations containing two variables, given the value of one of them.

The equation needs to be inputted in the form of 'equation:x="num";y=<+/->"num".x^"num"....'

Where each term consists of a positive or negative sign and each "num" can be replaced by an interger of our choice. As of now, negative intergers aren't accepted.....


1.> As co-efficient, simply because the sign at the beginning of each term can be used to carry out the same function and,

2.> As exponents, because the code does not possess that functionality yet.


Given the value of x and the terms, the value of y will be computed by converting the string to json by extracting all the values and carrying out a final set of computations over the generated json object.

Unit Tests can be found for the same in the folder of ./src/main/Tests/
