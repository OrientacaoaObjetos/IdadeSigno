public class Relogio {
	
	private Long tempo;
	
	public Relogio(Long tempo) {
		this.tempo = tempo;
	}
	
	public long agora() {
		if (tempo == 0) {
			return System.currentTimeMillis();
		}
		
		return tempo;
	}

}
