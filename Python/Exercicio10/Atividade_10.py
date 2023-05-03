class Atividade_8:

    cont = 0
    d2 = 2
    total = 0.0

# Estrutura Do While em Python
    while True:
        ser = int(input("Digite a quantidade de números na série: "))
        if not ( ser < 5 and ser > 30):
            break

    while(cont < ser):
        d1 = 100
        d1 = d1 - d2
        calc = d1 / d2
        total = total + calc

        d2 = d2 + 2
        cont = cont + 1;

    print("Resultado: ", total)


