package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DetalheRetornoMovimentoBco extends AbstractSankhyaEntity<DetalheRetornoMovimentoBco> {
   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getIdLinha() {
        return this.getVo().asString("IDLINHA");
   }

   public void setIdLinha(String idLinha) {
        markAsChanged("IDLINHA", idLinha);
   }

   public String getIdValor() {
        return this.getVo().asString("IDVALOR");
   }

   public void setIdValor(String idValor) {
        markAsChanged("IDVALOR", idValor);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getPosFim() {
        return this.getVo().asBigDecimal("POSFIM");
   }

   public void setPosFim(BigDecimal posFim) {
        markAsChanged("POSFIM", posFim);
   }

   public BigDecimal getPosIni() {
        return this.getVo().asBigDecimal("POSINI");
   }

   public void setPosIni(BigDecimal posIni) {
        markAsChanged("POSINI", posIni);
   }

   public BigDecimal getQtdDec() {
        return this.getVo().asBigDecimal("QTDDEC");
   }

   public void setQtdDec(BigDecimal qtdDec) {
        markAsChanged("QTDDEC", qtdDec);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSIIRT";
   }

   @Override
   public String getEntityName() {
        return "DetalheRetornoMovimentoBco";
   }

   @Override
   public DetalheRetornoMovimentoBco fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
