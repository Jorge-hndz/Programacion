num = int(input("Introduce un numero entero positivo y te dare su factorial: "))
def my_function(num):
    total = 1
    for i in range(1, num+1):
        total = total * i
    print(total)

my_function(num)