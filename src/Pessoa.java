import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private Date dataDeNascimento;
	
	public Pessoa(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Integer getIdade() {
		Relogio relogio = new Relogio(0L);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataDeNascimento);
		
		Calendar hoje = Calendar.getInstance();
		hoje.setTimeInMillis(relogio.agora());
		
		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		
		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
			&& hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
			idade --;
		}
		
		return idade;
	}
	
	public String getSigno() {
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataDeNascimento);
		
		if (isAries(dataNascimento)) {
			return "Áries";
		} else if (isTouro(dataNascimento)) {
			return "Touro";
		} else if (isGemeos(dataNascimento)) {
			return "Gêmeos";
		} else if (isCancer(dataNascimento)) {
			return "Câncer";
		} else if (isLeao(dataNascimento)) {
			return "Leão";
		} else if (isVirgem(dataNascimento)) {
			return "Virgem";
		} else if (isLibra(dataNascimento)) {
			return "Libra";
		} else if (isEscorpiao(dataNascimento)) {
			return "Escorpião";
		} else if (isSargitario(dataNascimento)) {
			return "Sargitário";
		} else if (isCapricornio(dataNascimento)) {
			return "Capricórnio";
		} else if (isAquario(dataNascimento)) {
			return "Aquário";
		} else if (isPeixes(dataNascimento)) {
			return "Peixes";
		}
		
		return "";
	}
	
	private boolean isAries(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 3 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 4 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20) {
			return true;
		}
		
		return false;
	}
	
	private boolean isTouro(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 4 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 5 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20) {
			return true;
		}
		
		return false;
	}
	
	private boolean isGemeos(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 5 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 6 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20) {
			return true;
		}
		
		return false;
	}
	
	private boolean isCancer(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21 && dataNascimento.get(Calendar.MONTH) == 6) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 21 && dataNascimento.get(Calendar.MONTH) == 7)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isLeao(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 7 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 8 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22) {
			return true;
		}
		
		return false;
	}
	
	private boolean isVirgem(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 8 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 9 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22) {
			return true;
		}
		
		return false;
	}
	
	private boolean isLibra(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 9 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 10 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22) {
			return true;
		}
		
		return false;
	}
	
	private boolean isEscorpiao(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 10 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 11 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 21) {
			return true;
		}
		
		return false;
	}
	
	private boolean isSargitario(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 11 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 12 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 21) {
			return true;
		}
		
		return false;
	}
	
	private boolean isCapricornio(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 12 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 1 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20) {
			return true;
		}
		
		return false;
	}
	
	private boolean isAquario(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 1 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 2 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 19) {
			return true;
		}
		
		return false;
	}
	
	private boolean isPeixes(Calendar dataNascimento) {
		if (dataNascimento.get(Calendar.MONTH)+1 == 2 && dataNascimento.get(Calendar.DAY_OF_MONTH) >= 20) {
			return true;
		}
		if (dataNascimento.get(Calendar.MONTH)+1 == 3 && dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20) {
			return true;
		}
		
		return false;
	}

}
