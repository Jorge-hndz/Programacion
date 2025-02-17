def funcion():
    array=[]
    num = 1
    while num != 0:
        num = int(input("Introduce numeros(0 para parar): "))
        if num != 0:
            array.append(num)

    for i in range(len(array)):
        array[i] = array[i] ** 2

    print(array)

funcion()