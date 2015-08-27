package sbi;

import sbi.model.Entity;
import sirius.kernel.Lifecycle;
import sirius.kernel.Sirius;
import sirius.kernel.di.std.Register;
import sirius.kernel.health.Log;

@Register
public class Main implements Lifecycle {

    private static final Log LOG = Log.get("main");

    @Override
    public void started() {
        LOG.WARN("started");

        Entity entity = new Entity(1234, "Gradle", "Pretty cool build tool", "BuildTool");
        LOG.SEVERE(entity.toString());

        Sirius.stop();
    }

    @Override
    public void stopped() {
        LOG.WARN("stopped");
    }

    @Override
    public void awaitTermination() {
        LOG.WARN("await");
    }

    @Override
    public String getName() {
        return "main";
    }
}