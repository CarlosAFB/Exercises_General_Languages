class Atividade_01:

    n1 = float(input("Digite a primeira nota: "))
    p1 = float(input("Digite o primeiro peso: "))

    n2 = float(input("Digite a segunda nota: "))
    p2 = float(input("Digita o segundo peso: "))

    n3 = float(input("Digite a terceira nota: "))
    p3 = float(input("Digite o terceiro peso: "))

    pn1 = p1 * 0.1
    pn2 = p2 * 0.1
    pn3 = p3 * 0.1

    med = (n1 * pn1 + n2 * pn2 + n3 * pn3)
    medfinal = med / 10

    print(f"Aluno com média poderada de: %f" % (medfinal))

    if (medfinal >= 60):
        print("Aprovado")
    else:
        print("Reprovado")