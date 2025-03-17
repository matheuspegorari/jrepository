package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Viagem extends AbstractSankhyaEntity<Viagem> {
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private BigDecimal codVeiprin;
   private BigDecimal codVeireb1;
   private BigDecimal codVeireb2;
   private BigDecimal codVeireb3;
   private Timestamp dhAlter;
   private BigDecimal nuViag;
   private String serie;
   private String statusDoc;
   private String tipAmb;
   private String tipModalmdfe;
   private String usaTomServcontr;
   private String usaCiotctevinc;
   private String contemDocterc;

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

   public BigDecimal getCodVeiprin() {
        return codVeiprin;
   }

   public void setCodVeiprin(BigDecimal codVeiprin) {
        this.codVeiprin = codVeiprin;
   }

   public BigDecimal getCodVeireb1() {
        return codVeireb1;
   }

   public void setCodVeireb1(BigDecimal codVeireb1) {
        this.codVeireb1 = codVeireb1;
   }

   public BigDecimal getCodVeireb2() {
        return codVeireb2;
   }

   public void setCodVeireb2(BigDecimal codVeireb2) {
        this.codVeireb2 = codVeireb2;
   }

   public BigDecimal getCodVeireb3() {
        return codVeireb3;
   }

   public void setCodVeireb3(BigDecimal codVeireb3) {
        this.codVeireb3 = codVeireb3;
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

   public String getTipModalmdfe() {
        return tipModalmdfe;
   }

   public void setTipModalmdfe(String tipModalmdfe) {
        this.tipModalmdfe = tipModalmdfe;
   }

   public String getUsaTomServcontr() {
        return usaTomServcontr;
   }

   public void setUsaTomServcontr(String usaTomServcontr) {
        this.usaTomServcontr = usaTomServcontr;
   }

   public String getUsaCiotctevinc() {
        return usaCiotctevinc;
   }

   public void setUsaCiotctevinc(String usaCiotctevinc) {
        this.usaCiotctevinc = usaCiotctevinc;
   }

   public String getContemDocterc() {
        return contemDocterc;
   }

   public void setContemDocterc(String contemDocterc) {
        this.contemDocterc = contemDocterc;
   }

   @Override
   public String getTableName() {
        return "TGFVIAG";
   }

   @Override
   public String getEntityName() {
        return "Viagem";
   }

   @Override
   public Viagem fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeiprin = vo.asBigDecimal("CODVEIPRIN");
        this.codVeireb1 = vo.asBigDecimal("CODVEIREB1");
        this.codVeireb2 = vo.asBigDecimal("CODVEIREB2");
        this.codVeireb3 = vo.asBigDecimal("CODVEIREB3");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.serie = vo.asString("SERIE");
        this.statusDoc = vo.asString("STATUSDOC");
        this.tipAmb = vo.asString("TIPAMB");
        this.tipModalmdfe = vo.asString("TIPMODALMDFE");
        this.usaTomServcontr = vo.asString("USATOMSERVCONTR");
        this.usaCiotctevinc = vo.asString("USACIOTCTEVINC");
        this.contemDocterc = vo.asString("CONTEMDOCTERC");
        return this;
   }
}
