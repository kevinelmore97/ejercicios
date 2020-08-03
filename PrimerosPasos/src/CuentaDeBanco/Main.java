package CuentaDeBanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CuentaB cuentaBanco = new CuentaB();
		CuentaB CuentaAhorro = new CuentaB();
		CuentaB CuentaCorriente = new CuentaB();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su tipo de cuenta bancaria");
		String tipoDeCuenta = sc.nextLine().toUpperCase();

		if (tipoDeCuenta.equals("CuentaCorriente")) {

			System.out.println("Ingrese sus nombres completos :");
			CuentaCorriente.setNombre(sc.nextLine().toUpperCase());
			System.out.println("ingrese su saldo :$");
			
			CuentaCorriente.setSaldo(Double.parseDouble(sc.nextLine()));

			if (CuentaCorriente.getSaldo() <= 1000) {

				CuentaCorriente.setSaldo(CuentaCorriente.getSaldo() * 1.01);

				System.out.println("Estimado cliente " + CuentaCorriente.getNombre()
						+ " usted ha recibido un aumento del 1 % su saldo actual CC es de $"
						+ CuentaCorriente.getSaldo());

			} else {
				System.out.println("Estimado  " + CuentaCorriente.getNombre() + " dispone de un saldo actual de  $ "
						+ CuentaCorriente.getSaldo());

			}

		}
		else if  (tipoDeCuenta.equals("CUENTA_AHORRO")) {

			System.out.println("Ingrese sus nombres completos :");
			CuentaAhorro.setNombre(sc.nextLine().toUpperCase());
			System.out.println("ingrese su saldo :$");
			CuentaAhorro.setSaldo(Double.parseDouble(sc.nextLine()));

			System.out.println("Estimado  " + CuentaAhorro.getNombre() + " su saldo actual de CA es de  $ "
					+ CuentaAhorro.getSaldo());

		}
		
		else
		System.out.println("USTED DEBE DE INGRESAR UN CC O CA");
	}




	}


