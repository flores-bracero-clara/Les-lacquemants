using System.Drawing;

namespace AwesomeRPG
{
	public class Character
	{
		public Character() { }

		public string? Type { get; set; }
		public Color? HairColor { get; set; }
		public Color? BodyColor { get; set; }
		public int? HairLength { get; set; }
		public int? BodyHeight { get; set; }

		public int[]? Attributes { get; set; }

		public override string ToString()
		{
			if (Attributes == null) throw new ArgumentNullException("Attributes");
			return $"Character: [\n\tType: {Type},\n\tAttributes: [\n\t\tIntelligence: {Attributes[0]},\n\t\tForce: {Attributes[1]}" +
				$",\n\t\tMagic: {Attributes[2]}\n\t],\n\tBody: [\n\t\tColor: {BodyColor},\n\t\tHeight: {BodyHeight}\n\t],\n\tHair:" +
				$"[\n\t\tColor: {HairColor},\n\t\tLength: {HairLength}\n\t]\n]";
		}
	}
}
