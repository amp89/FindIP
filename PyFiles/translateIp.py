print 'enter ip'
ip = input("ip>")

w = (ip/16777216)%256
x = (ip/65536)%256
y = (ip/256)%256
z = ip%256
print str(w)+"."+str(x)+"."+str(y)+"."+str(z)
