// Assignement 3
/*
 * 1. What is a String in Java?
 * String is a sequence of characters. But in Java, string is an object that
 * represents a sequence of
 * characters. The java.lang.String class is used to create a string object.
 * 
 * 
 * 
 * 2. Types of String are?
 * In java Strings are classified into 2 typesÃ
 * Mutable StringÃ
 * Immutable String
 * 
 * 
 * 
 * 3. In how many ways can you create string objects in Java?
 * There are two ways to create string objects in Java. One is using a new
 * operator and another
 * one is using string literals. The objects created using the new operator are
 * stored in the heap
 * memory and objects created using string literals are stored in the string
 * constant pool.
 * String s1 = new String("abc"); //Creating string object using new operator
 * String s2 = "abc"; //Creating string object using string literal
 * 
 * 
 * 4. What is a string constant pool?
 * String objects are the most commonly used data objects in Java. Hence, Java
 * has a special
 * arrangement to store the string objects. String Constant Pool is one such
 * arrangement.
 * String Constant Pool is the heap memory space dedicated to storing string
 * objects created with
 * string literals. In the String Constant Pool, there will be no two string
 * objects with the same
 * content.
 * When you use a string literal to create a string object, JVM first checks the
 * object's content. If
 * there is an object in the string constant pool with the same content, then it
 * returns the reference
 * to that object. It doesn’t create a new object. If the content differs from
 * the existing objects,
 * nonevent is generated.
 * 
 * 
 * 
 * 5. What do you mean by "mutable" and "immutable" objects?
 * Immutable objects are like constants. You can’t modify them once they are
 * created. They are
 * final in nature. Whereas mutable objects are concerned, you can perform
 * modifications on
 * them.
 * 
 * 
 * 6. Where exactly is the string constant pool located in the memory?
 * Inside the heap memory. JVM reserves some part of the heap
 * memory to store string objects created using string literals. In Java,
 * strings are special. String
 * types receive special treatment in Java that other types do not. For example,
 * to create the
 * string objects, you do not need to use the "new"‘ keyword. Whereas to create
 * other types of
 * objects, you have to use the "new" keyword. Like this, strings enjoy some
 * special attention from
 * Java. This attention is worth the while, because the strings are used almost
 * everywhere while
 * developing any kind of application
 * 
 * 
 * 
 */