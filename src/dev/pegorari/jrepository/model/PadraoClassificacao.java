package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PadraoClassificacao extends AbstractSankhyaEntity<PadraoClassificacao> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getClassificacao() {
        return this.getVo().asBigDecimal("CLASSIFICACAO");
   }

   public void setClassificacao(BigDecimal classificacao) {
        markAsChanged("CLASSIFICACAO", classificacao);
   }

   public BigDecimal getCodClt() {
        return this.getVo().asBigDecimal("CODCLT");
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getConfNegado() {
        return this.getVo().asString("CONFNEGADO");
   }

   public void setConfNegado(String confNegado) {
        markAsChanged("CONFNEGADO", confNegado);
   }

   public String getDescrClt() {
        return this.getVo().asString("DESCRCLT");
   }

   public void setDescrClt(String descrClt) {
        markAsChanged("DESCRCLT", descrClt);
   }

   public String getExigeLib() {
        return this.getVo().asString("EXIGELIB");
   }

   public void setExigeLib(String exigeLib) {
        markAsChanged("EXIGELIB", exigeLib);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getPrazoVal() {
        return this.getVo().asBigDecimal("PRAZOVAL");
   }

   public void setPrazoVal(BigDecimal prazoVal) {
        markAsChanged("PRAZOVAL", prazoVal);
   }

   public String getSigla() {
        return this.getVo().asString("SIGLA");
   }

   public void setSigla(String sigla) {
        markAsChanged("SIGLA", sigla);
   }

   public String getTipoLaudo() {
        return this.getVo().asString("TIPOLAUDO");
   }

   public void setTipoLaudo(String tipoLaudo) {
        markAsChanged("TIPOLAUDO", tipoLaudo);
   }

   public String getTipoRefPrzVal() {
        return this.getVo().asString("TIPOREFPRZVAL");
   }

   public void setTipoRefPrzVal(String tipoRefPrzVal) {
        markAsChanged("TIPOREFPRZVAL", tipoRefPrzVal);
   }

   public BigDecimal getCodGpc() {
        return this.getVo().asBigDecimal("CODGPC");
   }

   public void setCodGpc(BigDecimal codGpc) {
        markAsChanged("CODGPC", codGpc);
   }

   @Override
   public String getTableName() {
        return "TGACLT";
   }

   @Override
   public String getEntityName() {
        return "PadraoClassificacao";
   }

   @Override
   public PadraoClassificacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
