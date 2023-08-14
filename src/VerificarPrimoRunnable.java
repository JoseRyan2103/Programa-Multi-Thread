class VerificarPrimoRunnable implements Runnable {
    private int numero;

    public VerificarPrimoRunnable(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        if (verificarPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número "+ numero + " não é primo.");
        }
    }

    private boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
