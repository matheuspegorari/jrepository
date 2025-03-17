package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasExecucoes extends AbstractSankhyaEntity<PrevisaoVendasExecucoes> {
   private BigDecimal codExec;
   private BigDecimal codGrupo;
   private BigDecimal codProd;
   private String diretorio;
   private String tipo;

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDiretorio() {
        return diretorio;
   }

   public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TSLIPX";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasExecucoes";
   }

   @Override
   public PrevisaoVendasExecucoes fromVO(DynamicVO vo) {
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.diretorio = vo.asString("DIRETORIO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
