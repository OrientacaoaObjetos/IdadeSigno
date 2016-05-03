import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private Date dataDeNascimento;
	
	public Pessoa(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Integer getIdade() {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataDeNascimento);
		
		Calendar hoje = Calendar.getInstance();
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
			return "Escorpião";
		} else if (isCapricornio(dataNascimento)) {
			return "Escorpião";
		} else if (isAquario(dataNascimento)) {
			return "Escorpião";
		} else if (isPeixes(dataNascimento)) {
			return "Escorpião";
		}
		
		return "";
	}
	
	private boolean isAries(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21 && dataNascimento.get(Calendar.MONTH) == 3) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20 && dataNascimento.get(Calendar.MONTH) == 4)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isTouro(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21 && dataNascimento.get(Calendar.MONTH) == 4) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20 && dataNascimento.get(Calendar.MONTH) == 5)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isGemeos(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21 && dataNascimento.get(Calendar.MONTH) == 5) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20 && dataNascimento.get(Calendar.MONTH) == 6)) {
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
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22 && dataNascimento.get(Calendar.MONTH) == 7) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22 && dataNascimento.get(Calendar.MONTH) == 8)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isVirgem(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23 && dataNascimento.get(Calendar.MONTH) == 8) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22 && dataNascimento.get(Calendar.MONTH) == 9)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isLibra(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23 && dataNascimento.get(Calendar.MONTH) == 9) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 22 && dataNascimento.get(Calendar.MONTH) == 10)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isEscorpiao(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 23 && dataNascimento.get(Calendar.MONTH) == 10) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 21 && dataNascimento.get(Calendar.MONTH) == 11)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isSargitario(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22 && dataNascimento.get(Calendar.MONTH) == 11) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 21 && dataNascimento.get(Calendar.MONTH) == 12)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isCapricornio(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 22 && dataNascimento.get(Calendar.MONTH) == 12) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20 && dataNascimento.get(Calendar.MONTH) == 1)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isAquario(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 21 && dataNascimento.get(Calendar.MONTH) == 1) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 19 && dataNascimento.get(Calendar.MONTH) == 2)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isPeixes(Calendar dataNascimento) {
		if ((dataNascimento.get(Calendar.DAY_OF_MONTH) >= 20 && dataNascimento.get(Calendar.MONTH) == 2) && 
			(dataNascimento.get(Calendar.DAY_OF_MONTH) <= 20 && dataNascimento.get(Calendar.MONTH) == 3)) {
			return true;
		}
		
		return false;
	}

}
