package stats;

public class DocStatistics {
	
	private long docSize;
	private long timeTaken;
	
	private DocStatistics(long docSize, long timeTaken) {
		this.docSize = docSize;
		this.timeTaken = timeTaken;
	}
	
	public static DocStatistics create(long docSize, long timeTaken) {
		return new DocStatistics(docSize, timeTaken);
	}
	
	public long getDocSize() {
		return docSize;
	}
	
	public void setDocSize(long docSize) {
		this.docSize = docSize;
	}
	
	public long getTimeTaken() {
		return timeTaken;
	}
	
	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}
	
	@Override
	public String toString() {
		return "DocStatistics{" +
				       "docSize=" + docSize +
				       ", timeTaken=" + timeTaken +
				       '}';
	}
}
