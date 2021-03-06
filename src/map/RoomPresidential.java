package map;

import UI.Images;
import UI.Rectangle;
import controller.GameManager;

public class RoomPresidential extends Room{

	public RoomPresidential(int position, Map map) {
		super(Images.PRESIDENTIALROOM, position, 0, 4000, map);
		Room oldRoom = ((MapUpStair) map).getRoomsList().get(position);
		super.setAvailable(oldRoom.isAvailable);
		if(oldRoom.getVisitor() != null) {
			this.visitor = oldRoom.getVisitor();
		}
		GameManager.setnExecutive(GameManager.getnExecutive() - 1);
		GameManager.setnPresidential(GameManager.getnPresidential() + 1);
		
		if(position < 3) {
			super.addRoomStruct(new Rectangle(Images.VERTICALWALL, 0, 166*(this.position)));
			super.addRoomStruct(new Rectangle(Images.VERTICALWALLONDOOR, 197, 166*(this.position)+2));
			super.addRoomStruct(new Rectangle(Images.VERTICALWALLONDOOR, 197, 166*(this.position)+104));
			super.addRoomStruct(new Rectangle(Images.HORIZONTALWALL, 4, 166*(this.position)));
			super.addRoomStruct(new Rectangle(Images.HORIZONTALWALL, 4, 166*(this.position)+164));
			
			super.addRoomStruct(new Rectangle(Images.TOILETLEFT, 4, 166*(this.position) + 2));
			super.addRoomStruct(new Rectangle(Images.BEDLEFT, 4, 166*(this.position) + 101));
			super.addRoomStruct(new Rectangle(Images.TVLEFT, 87, 166*(this.position) + 115));
			super.addRoomStruct(new Rectangle(Images.BIGTABLELEFT, 112, 166*(this.position) + 6));
		}else{
			super.addRoomStruct(new Rectangle(Images.VERTICALWALL, 496, 166*(this.position-3)));
			super.addRoomStruct(new Rectangle(Images.VERTICALWALLONDOOR, 300, 166*(this.position-3)+2));
			super.addRoomStruct(new Rectangle(Images.VERTICALWALLONDOOR, 300, 166*(this.position-3)+104));
			super.addRoomStruct(new Rectangle(Images.HORIZONTALWALL, 300, 166*(this.position-3)));
			super.addRoomStruct(new Rectangle(Images.HORIZONTALWALL, 300, 166*(this.position-3)+164));
			
			super.addRoomStruct(new Rectangle(Images.TOILETRIGHT, 426, 166*(this.position-3) + 2));
			super.addRoomStruct(new Rectangle(Images.BEDRIGHT, 426, 166*(this.position-3) + 101));
			super.addRoomStruct(new Rectangle(Images.TVRIGHT, 315, 166*(this.position-3) + 115));
			super.addRoomStruct(new Rectangle(Images.BIGTABLERIGHT, 308, 166*(this.position-3) + 6));
		}
	}

}
