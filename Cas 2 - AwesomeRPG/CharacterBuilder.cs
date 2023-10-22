using System.Drawing;

namespace AwesomeRPG
{
	public class CharacterBuilder : ICharacterBuilder
	{
		private Character Built { get; set; }

		public CharacterBuilder()
		{
			Built = new Character();
		}

		public Character Build()
		{
			return Built;
		}
		public void ConfigureType(string Type)
		{
			Built.Type = Type;
		}

		public void ConfigureAttributes(int[] Attributes)
		{
			Built.Attributes = Attributes;
		}

		public void ConfigureBody(Color BodyColor, int BodyHeight)
		{
			Built.BodyColor = BodyColor;
			Built.BodyHeight = BodyHeight;
		}

		public void ConfigureHair(Color HairColor, int HairLength)
		{
			Built.HairColor = HairColor;
			Built.HairLength = HairLength;
		}

		public void Reset()
		{
			Built = new Character();
		}
	}
}
