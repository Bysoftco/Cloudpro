#factorial de N
#William Cristancho
def factor(n):
    fac=1;
    for i in range(1,n+1):
        fac=fac*i;
    return fac;
def main():
    x=int(input("Ingrese un numero "));
    print("Factorial de ",x,":=",factor(x));
main()
