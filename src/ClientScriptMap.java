public class ClientScriptMap extends Cacheable {

	public static AbstractFileStore staticJs5Index25;
	static Js5IndexImpl staticJs5IndexImpl14;
	static int[] staticIntArray129;
	static NodeSub8Sub1 staticNodeSub8Sub1_1;
	public static Cache staticCache23 = new Cache(64);
	public String defaultString = "null";
	public int anInt524 = 0;
	public char keyType;
	public char valType;
	public int defaultInt;
	public int[] anIntArray112;
	public String[] aStringArray9;
	public int[] anIntArray113;

	void method530(ByteBuf buffer, int opcode) {		
		if (opcode == 1) {
			keyType = (char) buffer.readUByte();			
		} else if (opcode == 2) {
			valType = (char) buffer.readUByte();			
		} else if (opcode == 3) {
			defaultString = buffer.readString();			
		} else if (opcode == 4) {
			defaultInt = buffer.readInt();			
		} else {
			int var3;
			if (opcode == 5) {
				anInt524 = buffer.readUShort();
				anIntArray112 = new int[anInt524];
				aStringArray9 = new String[anInt524];

				for (var3 = 0; var3 < anInt524; var3++) {
					anIntArray112[var3] = buffer.readInt();
					aStringArray9[var3] = buffer.readString();
				}
			} else if (opcode == 6) {
				anInt524 = buffer.readUShort();
				anIntArray112 = new int[anInt524];
				anIntArray113 = new int[anInt524];

				for (var3 = 0; var3 < anInt524; var3++) {
					anIntArray112[var3] = buffer.readInt();
					anIntArray113[var3] = buffer.readInt();
				}
			}
		}

	}

	public void method531(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method530(var1, var2);
		}
	}

}
