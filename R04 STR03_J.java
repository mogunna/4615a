//Rule 04. Characters and Strings (STR)
//Example STR03-J. Do not encode noncharacter data as a string
BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = Base64.getEncoder().encodeToString(byteArray);
byteArray = Base64.getDecoder().decode(s);
x = new BigInteger(byteArray);