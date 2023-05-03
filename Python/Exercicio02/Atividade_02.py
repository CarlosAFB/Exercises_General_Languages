class Atividade_02:

    print("...### Identificando Triângulo ###...")

    seg1 = int(input("Digite o primeiro segmento: "))
    seg2 = int(input("Digite o segundo segmento: "))
    seg3 = int(input("Digite o terceiro segmento: "))

    aux = seg1 - seg2

    if(aux <= seg3):
        if(seg1 == seg2 and seg2 == seg3):
            print("Triangulo Equilátero")
        elif(seg1 != seg2 and seg2 != seg3):
            print("Triangulo Isóceles")
        else:
            if(seg1 == seg2 and seg2 != seg3):
                print("Triangulo Isóceles")
            elif(seg1 == seg3 and seg3 != seg2):
                print("Triangulo Isóceles")
            elif (seg1 == seg3 and seg3 != seg1):
                print("Triangulo Isóceles")
    elif(aux > seg3):
        print("Não é Triangulo")