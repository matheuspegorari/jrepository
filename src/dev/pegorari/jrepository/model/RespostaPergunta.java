package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RespostaPergunta extends AbstractSankhyaEntity<RespostaPergunta> {
   private String ativo;
   private BigDecimal nota;
   private BigDecimal ordem;
   private String nomeArquivo;
   private String padrao;
   private String aceitaObservacao;
   private byte[] anexo;
   private BigDecimal codPerg;
   private BigDecimal codResp;
   private BigDecimal codUsu;
   private BigDecimal penalidade;
   private BigDecimal seqAgrupa;
   private BigDecimal tamanhoMax;
   private BigDecimal valorMax;
   private BigDecimal valorMin;
   private String descrResp;
   private Timestamp dhAlter;
   private String limpaAgrupa;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getNota() {
        return nota;
   }

   public void setNota(BigDecimal nota) {
        markAsChanged("NOTA", nota);
        this.nota = nota;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
   }

   public String getAceitaObservacao() {
        return aceitaObservacao;
   }

   public void setAceitaObservacao(String aceitaObservacao) {
        markAsChanged("ACEITAOBSERVACAO", aceitaObservacao);
        this.aceitaObservacao = aceitaObservacao;
   }

   public byte[] getAnexo() {
        return anexo;
   }

   public void setAnexo(byte[] anexo) {
        markAsChanged("ANEXO", anexo);
        this.anexo = anexo;
   }

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
        this.codPerg = codPerg;
   }

   public BigDecimal getCodResp() {
        return codResp;
   }

   public void setCodResp(BigDecimal codResp) {
        markAsChanged("CODRESP", codResp);
        this.codResp = codResp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getPenalidade() {
        return penalidade;
   }

   public void setPenalidade(BigDecimal penalidade) {
        markAsChanged("PENALIDADE", penalidade);
        this.penalidade = penalidade;
   }

   public BigDecimal getSeqAgrupa() {
        return seqAgrupa;
   }

   public void setSeqAgrupa(BigDecimal seqAgrupa) {
        markAsChanged("SEQAGRUPA", seqAgrupa);
        this.seqAgrupa = seqAgrupa;
   }

   public BigDecimal getTamanhoMax() {
        return tamanhoMax;
   }

   public void setTamanhoMax(BigDecimal tamanhoMax) {
        markAsChanged("TAMANHOMAX", tamanhoMax);
        this.tamanhoMax = tamanhoMax;
   }

   public BigDecimal getValorMax() {
        return valorMax;
   }

   public void setValorMax(BigDecimal valorMax) {
        markAsChanged("VALORMAX", valorMax);
        this.valorMax = valorMax;
   }

   public BigDecimal getValorMin() {
        return valorMin;
   }

   public void setValorMin(BigDecimal valorMin) {
        markAsChanged("VALORMIN", valorMin);
        this.valorMin = valorMin;
   }

   public String getDescrResp() {
        return descrResp;
   }

   public void setDescrResp(String descrResp) {
        markAsChanged("DESCRRESP", descrResp);
        this.descrResp = descrResp;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getLimpaAgrupa() {
        return limpaAgrupa;
   }

   public void setLimpaAgrupa(String limpaAgrupa) {
        markAsChanged("LIMPAAGRUPA", limpaAgrupa);
        this.limpaAgrupa = limpaAgrupa;
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
        this.ativo = vo.asString("ATIVO");
        this.nota = vo.asBigDecimal("NOTA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.padrao = vo.asString("PADRAO");
        this.aceitaObservacao = vo.asString("ACEITAOBSERVACAO");
        this.anexo = vo.asBlob("ANEXO");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codResp = vo.asBigDecimal("CODRESP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.penalidade = vo.asBigDecimal("PENALIDADE");
        this.seqAgrupa = vo.asBigDecimal("SEQAGRUPA");
        this.tamanhoMax = vo.asBigDecimal("TAMANHOMAX");
        this.valorMax = vo.asBigDecimal("VALORMAX");
        this.valorMin = vo.asBigDecimal("VALORMIN");
        this.descrResp = vo.asString("DESCRRESP");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.limpaAgrupa = vo.asString("LIMPAAGRUPA");
        return this;
   }
}
