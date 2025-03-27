package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RespostaPerguntaPesquisa extends AbstractSankhyaEntity<RespostaPerguntaPesquisa> {
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

   public BigDecimal getCodUsuCorretor() {
        return this.getVo().asBigDecimal("CODUSUCORRETOR");
   }

   public void setCodUsuCorretor(BigDecimal codUsuCorretor) {
        markAsChanged("CODUSUCORRETOR", codUsuCorretor);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCorrecao() {
        return this.getVo().asTimestamp("DHCORRECAO");
   }

   public void setDhCorrecao(Timestamp dhCorrecao) {
        markAsChanged("DHCORRECAO", dhCorrecao);
   }

   public BigDecimal getNota() {
        return this.getVo().asBigDecimal("NOTA");
   }

   public void setNota(BigDecimal nota) {
        markAsChanged("NOTA", nota);
   }

   public BigDecimal getNuPesq() {
        return this.getVo().asBigDecimal("NUPESQ");
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public String getProibElimepza() {
        return this.getVo().asString("PROIBELIMPEZA");
   }

   public void setProibElimepza(String proibElimepza) {
        markAsChanged("PROIBELIMPEZA", proibElimepza);
   }

   @Override
   public String getTableName() {
        return "TPQRPE";
   }

   @Override
   public String getEntityName() {
        return "RespostaPerguntaPesquisa";
   }

   @Override
   public RespostaPerguntaPesquisa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
