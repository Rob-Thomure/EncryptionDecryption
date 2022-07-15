# Encryption Decryption

A JetBrains Academy project. Written using Java.

* Use command line arguments to choose Encryption and Decryption choices

## Command line options

* -mode
    * options
        * enc
            * encrypts text (default choice)
        * dec
            * decrypts text
* -key
    * integer key to modify the text (default 0, no modification)
* -data
    * data to encrypt or decrypt (if left empty - no output)
* -alg
    * options
        * shift
            * shifts the ascii alphabet characters only
        * unicode
            * shifts all characters using unicode
* -out
    * if you choose to send output to file provide the file and path. If there is no -out argument, the output will be printed to the console
* -in
    * if you choose to input text by file. provide the txt file and path.

### Example command line

java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode

## Learning Outcomes

* Working with files and command lines. 
* Factory Method pattern

