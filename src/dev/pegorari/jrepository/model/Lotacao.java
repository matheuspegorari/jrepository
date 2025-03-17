package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lotacao implements SankhyaEntity<Lotacao> {

   private BigDecimal nuOcor;
   private BigDecimal codCargo;
   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtPosse;
   private Timestamp dtSaida;

   public BigDecimal getNuOcor() {
        return nuOcor;
   }

   public void setNuOcor(BigDecimal nuOcor) {
        this.nuOcor = nuOcor;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtPosse() {
        return dtPosse;
   }

   public void setDtPosse(Timestamp dtPosse) {
        this.dtPosse = dtPosse;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        this.dtSaida = dtSaida;
   }

   @Override
   public String getEntityName() {
        return "Lotacao";
   }

   @Override
   public Lotacao fromVO(DynamicVO vo) {
        this.nuOcor = vo.asBigDecimal("NUOCOR");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtPosse = vo.asTimestamp("DTPOSSE");
        this.dtSaida = vo.asTimestamp("DTSAIDA");
        return this;
   }
}
