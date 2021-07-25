class Atividade_03:

    inverso = 0

    digitado = int(input("Digite um número: "))
    num = int(digitado)

    while( num > 0):
        aux = num % 10
        num = num / 10
        inverso = (inverso * 10) + aux

    print(digitado)
    print(inverso)

    if(digitado == inverso):
        print("O número digitado é palindromo!")
    else:
        print("O número digitado não é palindromo!")

corrigir