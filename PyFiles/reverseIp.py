rawIp = raw_input("ip>")
ipArray = rawIp.split(".")
w = int(ipArray[0]);
x = int(ipArray[1]);
y = int(ipArray[2]);
z = int(ipArray[3]);

translatedIp = 16777216*w + 65536*x + 256*y + z
print translatedIp
