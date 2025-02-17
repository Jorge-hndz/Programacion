Array=[17, 25, 42, 205, 19, 30, 770,1]

for i in Array:
    if i > 500:
        break
    if i % 5 == 0 and i < 150:
        print(i)
