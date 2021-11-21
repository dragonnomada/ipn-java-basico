package ipn.cic.jbs6arreglos;

public class Chunk {

    byte[] buffer;
    int chunkSize;

    Chunk(byte[] buffer, int chunkSize) {
        this.buffer = buffer;
        this.chunkSize = chunkSize;
    }

    int getChunksTotal() {
        return (int) Math.ceil(1.0 * this.buffer.length / this.chunkSize);
    }

    byte[] getChunk(int chunkIndex) {
        byte[] chunk = new byte[this.chunkSize];
        
        for (int j = 0; j < this.chunkSize; j++) {
            if (chunkIndex * this.chunkSize + j < this.buffer.length) {
                chunk[j] = this.buffer[chunkIndex * this.chunkSize + j];
            } else {
                chunk[j] = (byte)0;
            }
        }
        
        return chunk;
    }

    void describeChunk(int chunkIndex) {
        byte[] chunk = this.getChunk(chunkIndex);
        
        for (byte b : chunk) {
            System.out.printf("%02x ", b);
        }
        
        System.out.println();
    }

    void describe() {
        int T = this.getChunksTotal();
        
        System.out.printf("Buffer Total: %d | Chunks Total %d | Chunk Size: %d\n",
                this.buffer.length, this.getChunksTotal(), this.chunkSize);
        
        for (byte b : this.buffer) {
            System.out.printf("%02x ", b);
        }
        
        System.out.println();
        System.out.println("-----------------------------");
        
        for (int t = 0; t < T; t++) {
            this.describeChunk(t);
        }
        
        System.out.println("-----------------------------");
    }

}
