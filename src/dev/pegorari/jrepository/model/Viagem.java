package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Viagem implements SankhyaEntity<Viagem> {

   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private BigDecimal codVeiPrin;
   private BigDecimal codVeiReb1;
   private BigDecimal codVeiReb2;
   private BigDecimal codVeiReb3;
   private Timestamp dhAlter;
   private BigDecimal nuViag;
   private String serie;
   private String statusDoc;
   private String tipAmb;
   private String tipModalMdfe;
   private String usaTomServContr;
   private String usaCioTcTevInc;
   private String contemDocTerc;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVeiPrin() {
        return codVeiPrin;
   }

   public void setCodVeiPrin(BigDecimal codVeiPrin) {
        this.codVeiPrin = codVeiPrin;
   }

   public BigDecimal getCodVeiReb1() {
        return codVeiReb1;
   }

   public void setCodVeiReb1(BigDecimal codVeiReb1) {
        this.codVeiReb1 = codVeiReb1;
   }

   public BigDecimal getCodVeiReb2() {
        return codVeiReb2;
   }

   public void setCodVeiReb2(BigDecimal codVeiReb2) {
        this.codVeiReb2 = codVeiReb2;
   }

   public BigDecimal getCodVeiReb3() {
        return codVeiReb3;
   }

   public void setCodVeiReb3(BigDecimal codVeiReb3) {
        this.codVeiReb3 = codVeiReb3;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public String getStatusDoc() {
        return statusDoc;
   }

   public void setStatusDoc(String statusDoc) {
        this.statusDoc = statusDoc;
   }

   public String getTipAmb() {
        return tipAmb;
   }

   public void setTipAmb(String tipAmb) {
        this.tipAmb = tipAmb;
   }

   public String getTipModalMdfe() {
        return tipModalMdfe;
   }

   public void setTipModalMdfe(String tipModalMdfe) {
        this.tipModalMdfe = tipModalMdfe;
   }

   public String getUsaTomServContr() {
        return usaTomServContr;
   }

   public void setUsaTomServContr(String usaTomServContr) {
        this.usaTomServContr = usaTomServContr;
   }

   public String getUsaCioTcTevInc() {
        return usaCioTcTevInc;
   }

   public void setUsaCioTcTevInc(String usaCioTcTevInc) {
        this.usaCioTcTevInc = usaCioTcTevInc;
   }

   public String getContemDocTerc() {
        return contemDocTerc;
   }

   public void setContemDocTerc(String contemDocTerc) {
        this.contemDocTerc = contemDocTerc;
   }

   @Override
   public String getEntityName() {
        return "Viagem";
   }

   @Override
   public Viagem fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeiPrin = vo.asBigDecimal("CODVEIPRIN");
        this.codVeiReb1 = vo.asBigDecimal("CODVEIREB1");
        this.codVeiReb2 = vo.asBigDecimal("CODVEIREB2");
        this.codVeiReb3 = vo.asBigDecimal("CODVEIREB3");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.serie = vo.asString("SERIE");
        this.statusDoc = vo.asString("STATUSDOC");
        this.tipAmb = vo.asString("TIPAMB");
        this.tipModalMdfe = vo.asString("TIPMODALMDFE");
        this.usaTomServContr = vo.asString("USATOMSERVCONTR");
        this.usaCioTcTevInc = vo.asString("USACIOTCTEVINC");
        this.contemDocTerc = vo.asString("CONTEMDOCTERC");
        return this;
   }
}
