#Funcion Absoluto
#video Drive Area y Volumen de :CUBO, Esfera,
import math;
def absn(n):
    if n<0 :
        return n*-1;
    else :
       return n;
#Cuadrado
def cuadra2(n):
    if n==0:
        return 0;
    else :
        return n*n;
#Factorial
def factor(n):
    fac=1;
    for i in range(1,n+1):
        fac=fac*i;
    return fac;
def divis(a,b):
    r=0;
    if b==0:
        print("Error NO definido Divison por 0");
    else:
        r=a/b;
        return r;
def raiz2(x) :
    return math.pow(x,0.5);
def main():
    x=int(input("Ingrese n: "));
    print ("El valor absoluto de:",x," Es =:",absn(x));
    print ("El Cuadrado de :",x," Es =:",cuadra2(x));
    print ("El Factorial de:",x," Es =:",factor(x));
    y=int(input("Ingrese un valor para y: "));
    print ("Division :=",divis(x,y));
    print ("raiz de x:=",raiz2(x))
main()


