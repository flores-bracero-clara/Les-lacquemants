using System.Drawing;

namespace AwesomeRPG
{
	class Program
	{
		private static void Main(string[] args)
		{
			CharacterBuilder Builder = new CharacterBuilder();
			//Builder.Reset();
			Builder.ConfigureType("Warlock");
			Builder.ConfigureAttributes(new int[3] { 2, 1, 2 });
			Builder.ConfigureBody(Color.Beige, 180);
			Builder.ConfigureHair(Color.Red, 21);
			Character MyCharacter = Builder.Build();
			Console.WriteLine(MyCharacter.ToString());
		}
	}
}