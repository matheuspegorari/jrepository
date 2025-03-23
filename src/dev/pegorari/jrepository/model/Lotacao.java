package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lotacao extends AbstractSankhyaEntity<Lotacao> {
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
        markAsChanged("NUOCOR", nuOcor);
        this.nuOcor = nuOcor;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
        this.codCargo = codCargo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtPosse() {
        return dtPosse;
   }

   public void setDtPosse(Timestamp dtPosse) {
        markAsChanged("DTPOSSE", dtPosse);
        this.dtPosse = dtPosse;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
        this.dtSaida = dtSaida;
   }

   @Override
   public String getTableName() {
        return "TFPLOT";
   }

   @Override
   public String getEntityName() {
        return "Lotacao";
   }

   @Override
   public Lotacao fromVO(DynamicVO vo) {
        this.setVo(vo);
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
