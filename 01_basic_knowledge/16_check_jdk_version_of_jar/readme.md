# check the JDK version of .jar by .class file

get the .class file at .jar by 7-zip.

``` cmd
javap -verbose Configuration.class > 1.txt
```

check 'major version' property at 1.txt

* major version: 52(java8)
* major version: 50(java6)

this really tells you what compiler compiled your classes.
* J2SE 6.0 = 50 (0x32 hex)
* J2SE 5.0 = 49 (0x31 hex)
* JDK 1.4 = 48 (0x30 hex)
* JDK 1.3 = 47 (0x2F hex)
* JDK 1.2 = 46 (0x2E hex)
* JDK 1.1 = 45 (0x2D hex)
