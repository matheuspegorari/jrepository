package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroProspect extends AbstractSankhyaEntity<ParceiroProspect> {
   public Timestamp getDhCadSefaz() {
        return this.getVo().asTimestamp("DHCADSEFAZ");
   }

   public void setDhCadSefaz(Timestamp dhCadSefaz) {
        markAsChanged("DHCADSEFAZ", dhCadSefaz);
   }

   public String getSitCadSefaz() {
        return this.getVo().asString("SITCADSEFAZ");
   }

   public void setSitCadSefaz(String sitCadSefaz) {
        markAsChanged("SITCADSEFAZ", sitCadSefaz);
   }

   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcB2b() {
        return this.getVo().asBigDecimal("CODPARCB2B");
   }

   public void setCodParcB2b(BigDecimal codParcB2b) {
        markAsChanged("CODPARCB2B", codParcB2b);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public Timestamp getDataEmissaoRg() {
        return this.getVo().asTimestamp("DATAEMISSAORG");
   }

   public void setDataEmissaoRg(Timestamp dataEmissaoRg) {
        markAsChanged("DATAEMISSAORG", dataEmissaoRg);
   }

   public BigDecimal getDiaPagto() {
        return this.getVo().asBigDecimal("DIAPAGTO");
   }

   public void setDiaPagto(BigDecimal diaPagto) {
        markAsChanged("DIAPAGTO", diaPagto);
   }

   public Timestamp getDtCad() {
        return this.getVo().asTimestamp("DTCAD");
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEmissaoRg() {
        return this.getVo().asString("EMISSAORG");
   }

   public void setEmissaoRg(String emissaoRg) {
        markAsChanged("EMISSAORG", emissaoRg);
   }

   public String getEndereco() {
        return this.getVo().asString("ENDERECO");
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
   }

   public String getEscolaridade() {
        return this.getVo().asString("ESCOLARIDADE");
   }

   public void setEscolaridade(String escolaridade) {
        markAsChanged("ESCOLARIDADE", escolaridade);
   }

   public String getEstadoCivil() {
        return this.getVo().asString("ESTADOCIVIL");
   }

   public void setEstadoCivil(String estadoCivil) {
        markAsChanged("ESTADOCIVIL", estadoCivil);
   }

   public String getIdentInscEstad() {
        return this.getVo().asString("IDENTINSCESTAD");
   }

   public void setIdentInscEstad(String identInscEstad) {
        markAsChanged("IDENTINSCESTAD", identInscEstad);
   }

   public String getIsPropostaCartao() {
        return this.getVo().asString("ISPROPOSTACARTAO");
   }

   public void setIsPropostaCartao(String isPropostaCartao) {
        markAsChanged("ISPROPOSTACARTAO", isPropostaCartao);
   }

   public BigDecimal getLimCred() {
        return this.getVo().asBigDecimal("LIMCRED");
   }

   public void setLimCred(BigDecimal limCred) {
        markAsChanged("LIMCRED", limCred);
   }

   public BigDecimal getNaturalidade() {
        return this.getVo().asBigDecimal("NATURALIDADE");
   }

   public void setNaturalidade(BigDecimal naturalidade) {
        markAsChanged("NATURALIDADE", naturalidade);
   }

   public String getNomeBai() {
        return this.getVo().asString("NOMEBAI");
   }

   public void setNomeBai(String nomeBai) {
        markAsChanged("NOMEBAI", nomeBai);
   }

   public String getNomeCartao() {
        return this.getVo().asString("NOMECARTAO");
   }

   public void setNomeCartao(String nomeCartao) {
        markAsChanged("NOMECARTAO", nomeCartao);
   }

   public String getNomeCid() {
        return this.getVo().asString("NOMECID");
   }

   public void setNomeCid(String nomeCid) {
        markAsChanged("NOMECID", nomeCid);
   }

   public String getNomeConjuge() {
        return this.getVo().asString("NOMECONJUGE");
   }

   public void setNomeConjuge(String nomeConjuge) {
        markAsChanged("NOMECONJUGE", nomeConjuge);
   }

   public String getNomeMae() {
        return this.getVo().asString("NOMEMAE");
   }

   public void setNomeMae(String nomeMae) {
        markAsChanged("NOMEMAE", nomeMae);
   }

   public String getNomePai() {
        return this.getVo().asString("NOMEPAI");
   }

   public void setNomePai(String nomePai) {
        markAsChanged("NOMEPAI", nomePai);
   }

   public String getNomePap() {
        return this.getVo().asString("NOMEPAP");
   }

   public void setNomePap(String nomePap) {
        markAsChanged("NOMEPAP", nomePap);
   }

   public BigDecimal getNroAns() {
        return this.getVo().asBigDecimal("NROANS");
   }

   public void setNroAns(BigDecimal nroAns) {
        markAsChanged("NROANS", nroAns);
   }

   public BigDecimal getNroBen() {
        return this.getVo().asBigDecimal("NROBEN");
   }

   public void setNroBen(BigDecimal nroBen) {
        markAsChanged("NROBEN", nroBen);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
   }

   public String getPossuiCartaoCredito() {
        return this.getVo().asString("POSSUICARTAOCREDITO");
   }

   public void setPossuiCartaoCredito(String possuiCartaoCredito) {
        markAsChanged("POSSUICARTAOCREDITO", possuiCartaoCredito);
   }

   public BigDecimal getQtdeDependentes() {
        return this.getVo().asBigDecimal("QTDEDEPENDENTES");
   }

   public void setQtdeDependentes(BigDecimal qtdeDependentes) {
        markAsChanged("QTDEDEPENDENTES", qtdeDependentes);
   }

   public String getRazaoSocial() {
        return this.getVo().asString("RAZAOSOCIAL");
   }

   public void setRazaoSocial(String razaoSocial) {
        markAsChanged("RAZAOSOCIAL", razaoSocial);
   }

   public String getRg() {
        return this.getVo().asString("RG");
   }

   public void setRg(String rg) {
        markAsChanged("RG", rg);
   }

   public String getSexo() {
        return this.getVo().asString("SEXO");
   }

   public void setSexo(String sexo) {
        markAsChanged("SEXO", sexo);
   }

   public String getStatusProposta() {
        return this.getVo().asString("STATUSPROPOSTA");
   }

   public void setStatusProposta(String statusProposta) {
        markAsChanged("STATUSPROPOSTA", statusProposta);
   }

   public String getTelCelular() {
        return this.getVo().asString("TELCELULAR");
   }

   public void setTelCelular(String telCelular) {
        markAsChanged("TELCELULAR", telCelular);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTipoResidencia() {
        return this.getVo().asString("TIPORESIDENCIA");
   }

   public void setTipoResidencia(String tipoResidencia) {
        markAsChanged("TIPORESIDENCIA", tipoResidencia);
   }

   public String getTipPessoa() {
        return this.getVo().asString("TIPPESSOA");
   }

   public void setTipPessoa(String tipPessoa) {
        markAsChanged("TIPPESSOA", tipPessoa);
   }

   public BigDecimal getUfRg() {
        return this.getVo().asBigDecimal("UFRG");
   }

   public void setUfRg(BigDecimal ufRg) {
        markAsChanged("UFRG", ufRg);
   }

   public String getCartaoCredito() {
        return this.getVo().asString("CARTAOCREDITO");
   }

   public void setCartaoCredito(String cartaoCredito) {
        markAsChanged("CARTAOCREDITO", cartaoCredito);
   }

   public BigDecimal getCarteiraTrab() {
        return this.getVo().asBigDecimal("CARTEIRATRAB");
   }

   public void setCarteiraTrab(BigDecimal carteiraTrab) {
        markAsChanged("CARTEIRATRAB", carteiraTrab);
   }

   public String getCelularConjuge() {
        return this.getVo().asString("CELULARCONJUGE");
   }

   public void setCelularConjuge(String celularConjuge) {
        markAsChanged("CELULARCONJUGE", celularConjuge);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCnae() {
        return this.getVo().asString("CNAE");
   }

   public void setCnae(String cnae) {
        markAsChanged("CNAE", cnae);
   }

   public Timestamp getDhCadRf() {
        return this.getVo().asTimestamp("DHCADRF");
   }

   public void setDhCadRf(Timestamp dhCadRf) {
        markAsChanged("DHCADRF", dhCadRf);
   }

   public Timestamp getDtBaixa() {
        return this.getVo().asTimestamp("DTBAIXA");
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        markAsChanged("DTBAIXA", dtBaixa);
   }

   public Timestamp getDtIniAtiv() {
        return this.getVo().asTimestamp("DTINIATIV");
   }

   public void setDtIniAtiv(Timestamp dtIniAtiv) {
        markAsChanged("DTINIATIV", dtIniAtiv);
   }

   public Timestamp getDtUltSit() {
        return this.getVo().asTimestamp("DTULTSIT");
   }

   public void setDtUltSit(Timestamp dtUltSit) {
        markAsChanged("DTULTSIT", dtUltSit);
   }

   public BigDecimal getIndCredCte() {
        return this.getVo().asBigDecimal("INDCREDCTE");
   }

   public void setIndCredCte(BigDecimal indCredCte) {
        markAsChanged("INDCREDCTE", indCredCte);
   }

   public BigDecimal getIndCredNfe() {
        return this.getVo().asBigDecimal("INDCREDNFE");
   }

   public void setIndCredNfe(BigDecimal indCredNfe) {
        markAsChanged("INDCREDNFE", indCredNfe);
   }

   public String getRegApur() {
        return this.getVo().asString("REGAPUR");
   }

   public void setRegApur(String regApur) {
        markAsChanged("REGAPUR", regApur);
   }

   public BigDecimal getSitCadRf() {
        return this.getVo().asBigDecimal("SITCADRF");
   }

   public void setSitCadRf(BigDecimal sitCadRf) {
        markAsChanged("SITCADRF", sitCadRf);
   }

   public BigDecimal getIntervAnalisCred() {
        return this.getVo().asBigDecimal("INTERVANALISCRED");
   }

   public void setIntervAnalisCred(BigDecimal intervAnalisCred) {
        markAsChanged("INTERVANALISCRED", intervAnalisCred);
   }

   @Override
   public String getTableName() {
        return "TCSPAP";
   }

   @Override
   public String getEntityName() {
        return "ParceiroProspect";
   }

   @Override
   public ParceiroProspect fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
