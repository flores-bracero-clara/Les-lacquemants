using System.Drawing;

namespace AwesomeRPG
{
	public interface ICharacterBuilder
	{
		Character Build();
		void ConfigureType(string Type);
		void ConfigureAttributes(int[] Attributes);
		void ConfigureBody(Color BodyColor, int BodyHeight);
		void ConfigureHair(Color HairColor, int HairLength);
		void Reset();
	}
}
