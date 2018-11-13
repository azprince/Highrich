package map;

import java.util.ArrayList;

import UI.Images;
import UI.Rectangle;
import character.Npc;
import javafx.scene.canvas.GraphicsContext;
import map.RoomConstruction;

public class MapUpStair extends Map{
	private ArrayList<Room> roomsList;
	
	public MapUpStair() {
		super();
		this.roomsList = new ArrayList<Room>();
		initRoom();
		this.setWarpUp(new Rectangle(Images.WARP, 190, 0));
		this.setWarpDown(new Rectangle(Images.WARP, 190, 480));
		this.setBackground(Images.FLOOR);
	}
	
	private void initRoom() {
		for(int i = 0; i < 6; i++) {
			roomsList.add(new RoomConstruction(i));
		}
	}
	
	public void addRoom(Room o) {
/* not sure		if(roomsList.size() == 6) throw new Exception("Full Room"); */
		roomsList.add(o);
	}
	
	public void removeRoom(int position) {
		boolean check = false;
		for(int i = 0; i < 6; i++) {
			if(this.roomsList.get(i).position == position) {
				if(this.roomsList.get(i) instanceof RoomConstruction) {
/* not sure 	throw new Exception("This room is aleady construction"); */
				}else {
					this.roomsList.set(i, new RoomConstruction(i));
					break;
				}
			}
		}	
	}
	
	@Override
	public void render(GraphicsContext gc) {
		super.getBackground().render(gc);
		super.getWarpUp().render(gc);
		super.getWarpDown().render(gc);
		for(Rectangle r: super.getStructList()) r.render(gc);
		for(Npc npc: this.getNpcList()) npc.render(gc);
		for(Room o : roomsList) o.render(gc);
	}
	
}
