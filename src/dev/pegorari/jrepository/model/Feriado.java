package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Feriado extends AbstractSankhyaEntity<Feriado> {
   private BigDecimal codCid;
   private BigDecimal codPais;
   private BigDecimal codUf;
   private String descFeriado;
   private Timestamp dtFeriado;
   private String nacional;
   private String obrigatorio;
   private String recorrente;
   private String usaNoPonto;

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        this.codPais = codPais;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public String getDescFeriado() {
        return descFeriado;
   }

   public void setDescFeriado(String descFeriado) {
        this.descFeriado = descFeriado;
   }

   public Timestamp getDtFeriado() {
        return dtFeriado;
   }

   public void setDtFeriado(Timestamp dtFeriado) {
        this.dtFeriado = dtFeriado;
   }

   public String getNacional() {
        return nacional;
   }

   public void setNacional(String nacional) {
        this.nacional = nacional;
   }

   public String getObrigatorio() {
        return obrigatorio;
   }

   public void setObrigatorio(String obrigatorio) {
        this.obrigatorio = obrigatorio;
   }

   public String getRecorrente() {
        return recorrente;
   }

   public void setRecorrente(String recorrente) {
        this.recorrente = recorrente;
   }

   public String getUsaNoPonto() {
        return usaNoPonto;
   }

   public void setUsaNoPonto(String usaNoPonto) {
        this.usaNoPonto = usaNoPonto;
   }

   @Override
   public String getTableName() {
        return "TSIFER";
   }

   @Override
   public String getEntityName() {
        return "Feriado";
   }

   @Override
   public Feriado fromVO(DynamicVO vo) {
        this.codCid = vo.asBigDecimal("CODCID");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codUf = vo.asBigDecimal("CODUF");
        this.descFeriado = vo.asString("DESCRFERIADO");
        this.dtFeriado = vo.asTimestamp("DTFERIADO");
        this.nacional = vo.asString("NACIONAL");
        this.obrigatorio = vo.asString("OBRIGATORIO");
        this.recorrente = vo.asString("RECORRENTE");
        this.usaNoPonto = vo.asString("USANOPONTO");
        return this;
   }
}
