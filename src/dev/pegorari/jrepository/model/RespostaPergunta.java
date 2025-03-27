package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RespostaPergunta extends AbstractSankhyaEntity<RespostaPergunta> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getNota() {
        return this.getVo().asBigDecimal("NOTA");
   }

   public void setNota(BigDecimal nota) {
        markAsChanged("NOTA", nota);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public String getAceitaObservacao() {
        return this.getVo().asString("ACEITAOBSERVACAO");
   }

   public void setAceitaObservacao(String aceitaObservacao) {
        markAsChanged("ACEITAOBSERVACAO", aceitaObservacao);
   }

   public byte[] getAnexo() {
        return this.getVo().asBlob("ANEXO");
   }

   public void setAnexo(byte[] anexo) {
        markAsChanged("ANEXO", anexo);
   }

   public BigDecimal getCodPerg() {
        return this.getVo().asBigDecimal("CODPERG");
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
   }

   public BigDecimal getCodResp() {
        return this.getVo().asBigDecimal("CODRESP");
   }

   public void setCodResp(BigDecimal codResp) {
        markAsChanged("CODRESP", codResp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getPenalidade() {
        return this.getVo().asBigDecimal("PENALIDADE");
   }

   public void setPenalidade(BigDecimal penalidade) {
        markAsChanged("PENALIDADE", penalidade);
   }

   public BigDecimal getSeqAgrupa() {
        return this.getVo().asBigDecimal("SEQAGRUPA");
   }

   public void setSeqAgrupa(BigDecimal seqAgrupa) {
        markAsChanged("SEQAGRUPA", seqAgrupa);
   }

   public BigDecimal getTamanhoMax() {
        return this.getVo().asBigDecimal("TAMANHOMAX");
   }

   public void setTamanhoMax(BigDecimal tamanhoMax) {
        markAsChanged("TAMANHOMAX", tamanhoMax);
   }

   public BigDecimal getValorMax() {
        return this.getVo().asBigDecimal("VALORMAX");
   }

   public void setValorMax(BigDecimal valorMax) {
        markAsChanged("VALORMAX", valorMax);
   }

   public BigDecimal getValorMin() {
        return this.getVo().asBigDecimal("VALORMIN");
   }

   public void setValorMin(BigDecimal valorMin) {
        markAsChanged("VALORMIN", valorMin);
   }

   public String getDescrResp() {
        return this.getVo().asString("DESCRRESP");
   }

   public void setDescrResp(String descrResp) {
        markAsChanged("DESCRRESP", descrResp);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getLimpaAgrupa() {
        return this.getVo().asString("LIMPAAGRUPA");
   }

   public void setLimpaAgrupa(String limpaAgrupa) {
        markAsChanged("LIMPAAGRUPA", limpaAgrupa);
   }

   @Override
   public String getTableName() {
        return "TPQRES";
   }

   @Override
   public String getEntityName() {
        return "RespostaPergunta";
   }

   @Override
   public RespostaPergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
